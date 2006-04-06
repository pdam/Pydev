// Autogenerated AST node
package org.python.pydev.parser.jython.ast;
import org.python.pydev.parser.jython.SimpleNode;
import java.io.DataOutputStream;
import java.io.IOException;

public class ClassDef extends stmtType {
    public NameTokType name;
    public exprType[] bases;
    public stmtType[] body;

    public ClassDef(NameTokType name, exprType[] bases, stmtType[] body) {
        this.name = name;
        this.bases = bases;
        this.body = body;
    }

    public ClassDef(NameTokType name, exprType[] bases, stmtType[] body,
    SimpleNode parent) {
        this(name, bases, body);
        this.beginLine = parent.beginLine;
        this.beginColumn = parent.beginColumn;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer("ClassDef[");
        sb.append("name=");
        sb.append(dumpThis(this.name));
        sb.append(", ");
        sb.append("bases=");
        sb.append(dumpThis(this.bases));
        sb.append(", ");
        sb.append("body=");
        sb.append(dumpThis(this.body));
        sb.append("]");
        return sb.toString();
    }

    public void pickle(DataOutputStream ostream) throws IOException {
        pickleThis(8, ostream);
        pickleThis(this.name, ostream);
        pickleThis(this.bases, ostream);
        pickleThis(this.body, ostream);
    }

    public Object accept(VisitorIF visitor) throws Exception {
        return visitor.visitClassDef(this);
    }

    public void traverse(VisitorIF visitor) throws Exception {
        if (name != null)
            name.accept(visitor);
        if (bases != null) {
            for (int i = 0; i < bases.length; i++) {
                if (bases[i] != null)
                    bases[i].accept(visitor);
            }
        }
        if (body != null) {
            for (int i = 0; i < body.length; i++) {
                if (body[i] != null)
                    body[i].accept(visitor);
            }
        }
    }

}
