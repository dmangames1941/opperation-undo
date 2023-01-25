/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operationundo;

/**
 *
 * @author clatulip
 */
public class LineWidthOp extends DrawingOp {
    private int width;
    
    public LineWidthOp(String name, int lineWidth) {
        super(name);
        this.width = lineWidth;
    }

    @Override
    public String toString() {
        return super.toString() + " StateOp{" + "width=" + width + '}';
    }
    
}
