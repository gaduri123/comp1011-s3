/**
 * @author Goutham
 */
public class Vector2D
{
    private float m_x;
    private float m_y;
    //Constructors
    public Vector2D()
    {
        m_x = 0.0f;
        m_y = 0.0f;
    }


    public  Vector2D(float x, float y)
    {
        m_x = x;
        m_y = y;
    }



    public float getX()
    {

        return m_x;
    }


    public void setX(float new_x)
    {
        m_x = new_x;
    }


    public float getY()
    {

        return m_y;
    }


    public void setY(float new_y)
    {
        m_y = new_y;
    }


    public Vector2D Add(Vector2D vector)
    {
        m_x += vector.getX();
        m_x += vector.getY();
        // TODO implement here
        return null;
    }


    public Vector2D Subtract(Vector2D vector)
    {
        m_x = vector.getX() - m_x;
        m_y = vector.getY() - m_y;
        return null;
    }

}