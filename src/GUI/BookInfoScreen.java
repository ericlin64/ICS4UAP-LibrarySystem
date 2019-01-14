/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Engine.Library;
import java.awt.Dimension;
import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 *
 * @author 069949345
 */
public class BookInfoScreen extends javax.swing.JPanel {

    public Image img;
    public static Library lib = new Library();
    /**
     * Creates new form BookInfoScreen
     */
    public BookInfoScreen(){
        initComponents();
        try{
        lib.browseBook("");
        img = ImageIO.read(lib.cover);        }
        catch(IOException e){
            System.out.println("BookInfoScreen constructing error");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bookCover = new javax.swing.JLabel();
        putTitleHere = new javax.swing.JLabel();
        authorLabel = new javax.swing.JLabel();
        putAuthorNameHere = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        putPublishDateHere = new javax.swing.JLabel();
        publisherLabel = new javax.swing.JLabel();
        putPublisherNameHere = new javax.swing.JLabel();
        genreLabel = new javax.swing.JLabel();
        putGenreHere = new javax.swing.JLabel();
        readingLevelLabel = new javax.swing.JLabel();
        putReadingLevelHere = new javax.swing.JLabel();
        synopsisLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        putSynopsisHere = new javax.swing.JTextArea();
        averageRatingLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ratingsList = new javax.swing.JTextArea();
        putAverageRatingHere = new javax.swing.JLabel();
        ratingAndReviewButton = new javax.swing.JButton();

        addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                formAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        putTitleHere.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        putTitleHere.setText("Title goes here");

        authorLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        authorLabel.setText("Author:");

        putAuthorNameHere.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        putAuthorNameHere.setText("jLabel4");

        dateLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        dateLabel.setText("Date of Publication:");

        putPublishDateHere.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        putPublishDateHere.setText("jLabel6");

        publisherLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        publisherLabel.setText("Publisher:");

        putPublisherNameHere.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        putPublisherNameHere.setText("jLabel8");

        genreLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        genreLabel.setText("Genre:");

        putGenreHere.setText("jLabel10");

        readingLevelLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        readingLevelLabel.setText("Reading Level:");

        putReadingLevelHere.setText("jLabel12");

        synopsisLabel.setFont(new java.awt.Font("Lucida Fax", 0, 14)); // NOI18N
        synopsisLabel.setText("Synopsis:");

        putSynopsisHere.setEditable(false);
        putSynopsisHere.setColumns(20);
        putSynopsisHere.setLineWrap(true);
        putSynopsisHere.setRows(5);
        putSynopsisHere.setWrapStyleWord(true);
        putSynopsisHere.setOpaque(false);
        jScrollPane1.setViewportView(putSynopsisHere);

        averageRatingLabel.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        averageRatingLabel.setText("Average Rating:");

        ratingsList.setColumns(20);
        ratingsList.setRows(5);
        jScrollPane2.setViewportView(ratingsList);

        putAverageRatingHere.setText("jLabel15");

        ratingAndReviewButton.setText("Add Rating/Review");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(averageRatingLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(putAverageRatingHere)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(synopsisLabel)
                                    .addComponent(putTitleHere)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(authorLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(putAuthorNameHere))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(dateLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(putPublishDateHere))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(publisherLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(putPublisherNameHere))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(genreLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(putGenreHere))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(readingLevelLabel)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(putReadingLevelHere)))
                                .addGap(0, 76, Short.MAX_VALUE))
                            .addComponent(jScrollPane1)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(ratingAndReviewButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(putTitleHere)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(authorLabel)
                            .addComponent(putAuthorNameHere))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dateLabel)
                            .addComponent(putPublishDateHere))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publisherLabel)
                            .addComponent(putPublisherNameHere))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(genreLabel)
                            .addComponent(putGenreHere))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(readingLevelLabel)
                            .addComponent(putReadingLevelHere))
                        .addGap(4, 4, 4)
                        .addComponent(synopsisLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bookCover, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(averageRatingLabel)
                    .addComponent(putAverageRatingHere))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ratingAndReviewButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_formAncestorAdded
        // TODO add your handling code here:
        img = img.getScaledInstance(bookCover.getWidth(), bookCover.getHeight(), java.awt.Image.SCALE_SMOOTH);
        bookCover.setIcon(new ImageIcon(img));
        putAuthorNameHere.setText(lib.author);
        putTitleHere.setText(lib.title);
        putSynopsisHere.setText(lib.desc);
    }//GEN-LAST:event_formAncestorAdded


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLabel;
    private javax.swing.JLabel averageRatingLabel;
    private javax.swing.JLabel bookCover;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JLabel genreLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel publisherLabel;
    private javax.swing.JLabel putAuthorNameHere;
    private javax.swing.JLabel putAverageRatingHere;
    private javax.swing.JLabel putGenreHere;
    private javax.swing.JLabel putPublishDateHere;
    private javax.swing.JLabel putPublisherNameHere;
    private javax.swing.JLabel putReadingLevelHere;
    private javax.swing.JTextArea putSynopsisHere;
    private javax.swing.JLabel putTitleHere;
    private javax.swing.JButton ratingAndReviewButton;
    private javax.swing.JTextArea ratingsList;
    private javax.swing.JLabel readingLevelLabel;
    private javax.swing.JLabel synopsisLabel;
    // End of variables declaration//GEN-END:variables
}
