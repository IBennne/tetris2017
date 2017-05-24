/**
 * 
 */
package tp.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tp.model.Tetrimino;

/**
 * @author ajc
 *
 */

public class TetriminoApplicationDAO {
	private static Map<String, Tetrimino> tetriminos = new HashMap<String, Tetrimino>();


	public static List<Tetrimino> findAll() {
		return new ArrayList<>(tetriminos.values());
	}
	
	public static void delete(Tetrimino tetrimino) {
		tetriminos.remove(tetrimino.getId());
	}
	public static Tetrimino find(String id) {
		return tetriminos.get(id);
	}
}
	

