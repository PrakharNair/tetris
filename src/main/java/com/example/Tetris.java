package com.example;

import javax.swing.*;
import java.awt.*;

/*
 * Tetris game from zetcode.com
 * http://zetcode.com/gfx/java2d/tetris/
 */
public class Tetris extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel statusbar;

    public Tetris() {

        initUI();
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run() {

                Tetris game = new Tetris();
                game.setVisible(true);
            }
        });
    }

    private void initUI() {

        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        Board board = new Board(this);
        add(board);
        board.start();

        setSize(200, 400);
        setTitle("Tetris");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    public JLabel getStatusBar() {

        return statusbar;
    }
}

