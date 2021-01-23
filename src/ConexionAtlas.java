
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 * "mongodb+srv://jaimeAdmin:Jaime1@cluster0.dfqop.mongodb.net/Ejemplo1?retryWrites=true&w=majority");
 */
public class ConexionAtlas extends MongoClient{
    public ConexionAtlas(MongoClientURI direccionConexion){
        super(direccionConexion);
    }


}
