package by.academy.first_tasks;

import java.util.Objects;

import javax.swing.Box;

public class HeavyBox extends Box implements Comparable<HeavyBox> {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int width; 
    private int height;
    private int depth;
    private int weight;
    
   public HeavyBox(int w, int h, int d, int m) {
	   super(0);
        width = w;
        height = h;
        depth = d;
        weight = m; 
    }

@Override
public int getWidth() {
	return width;
}

public void setWidth(int width) {
	this.width = width;
}

@Override
public int getHeight() {
	return height;
}

public void setHeight(int height) {
	this.height = height;
}

public int getDepth() {
	return depth;
}

public void setDepth(int depth) {
	this.depth = depth;
}

public int getWeight() {
	return weight;
}

public void setWeight(int weight) {
	this.weight = weight;
}

@Override
public int hashCode() {
	return Objects.hash(depth, height, weight, width);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	HeavyBox other = (HeavyBox) obj;
	return depth == other.depth && height == other.height && weight == other.weight && width == other.width;
}

@Override
public String toString() {
	return "HeavyBox [width=" + width + ", height=" + height + ", depth=" + depth + ", weight=" + weight + "]";
}

@Override
public int compareTo(HeavyBox o) {
	return Integer.compare(weight, o.getWeight());
}
   
}

