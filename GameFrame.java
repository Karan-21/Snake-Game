import javax.swing.JFrame;

public class GameFrame extends JFrame{

	GameFrame(){
			
		this.add(new GamePanel());
//		Adding A Frame to the JFrame
		
		this.setTitle("Snake");
//		Setting the Title of that window to "Snake"
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		Make sure that if we click to close the application then the application
//		actually gets closed NOT running behind.
		
		this.setResizable(false);
//		Anyone cannot resize the window.
		
		this.pack();
//		Pack means the dimension is comming from GamePanel file and it is fixed
//		Also, pack() function is used inplace of other inbuilt 4 functions.
		
		this.setVisible(true);
//		Making the Frame visible to play the game.
		
		this.setLocationRelativeTo(null);
//		I want my window to be in the middle, whenever it has been fired.
		
	}
}
