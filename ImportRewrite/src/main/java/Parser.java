import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.dom.*;
import org.eclipse.jdt.core.dom.rewrite.ImportRewrite;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Parser {
    protected final static String SOURCE_PATH = "C:\\Users\\datvu\\Desktop\\spring-security\\gs-securing-web\\SpringBootSocialJPA\\src\\main\\java";
    public static void main(String[] args) throws IOException {
        List<ImportDeclaration> importDeclarationList = new ArrayList<>();
        ASTParser parser = ASTParser.newParser(AST.JLS11);
        parser.setResolveBindings(true);
        parser.setKind(ASTParser.K_COMPILATION_UNIT);

        parser.setBindingsRecovery(true);

        Map options = JavaCore.getOptions();
        parser.setCompilerOptions(options);

        String[] sources = { SOURCE_PATH };

        parser.setEnvironment(null, sources, new String[] { "UTF-8"}, true);

        parser.setUnitName(SOURCE_PATH);
        parser.setSource(SOURCE_PATH.toCharArray());
        CompilationUnit cu = (CompilationUnit) parser.createAST(null);

        cu.accept(new ASTVisitor() {
            @Override
            public boolean visit(AnnotationTypeDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(AnnotationTypeMemberDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(AnonymousClassDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayAccess node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayCreation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayInitializer node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ArrayType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(AssertStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(Assignment node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(Block node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(BlockComment node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(BooleanLiteral node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(BreakStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(CastExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(CatchClause node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(CharacterLiteral node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ClassInstanceCreation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(CompilationUnit node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ConditionalExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ConstructorInvocation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ContinueStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(CreationReference node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(Dimension node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(DoStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(EmptyStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(EnhancedForStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(EnumConstantDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(EnumDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ExportsDirective node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ExpressionMethodReference node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ExpressionStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(FieldAccess node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(FieldDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ForStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(IfStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ImportDeclaration node) {
                importDeclarationList.add(node);
                return super.visit(node);
            }

            @Override
            public boolean visit(InfixExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(Initializer node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(InstanceofExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(IntersectionType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(Javadoc node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(LabeledStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(LambdaExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(LineComment node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(MarkerAnnotation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(MemberRef node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(MemberValuePair node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodRef node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodRefParameter node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(MethodInvocation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(Modifier node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ModuleDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ModuleModifier node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(NameQualifiedType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(NormalAnnotation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(NullLiteral node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(NumberLiteral node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(OpensDirective node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(PackageDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ParameterizedType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ParenthesizedExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(PostfixExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(PrefixExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ProvidesDirective node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(PrimitiveType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(QualifiedName node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(QualifiedType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(RequiresDirective node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ReturnStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SimpleName node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SimpleType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SingleMemberAnnotation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SingleVariableDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(StringLiteral node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperConstructorInvocation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperFieldAccess node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperMethodInvocation node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SuperMethodReference node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SwitchCase node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SwitchExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SwitchStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(SynchronizedStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TagElement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TextBlock node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TextElement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ThisExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(ThrowStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TryStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeDeclaration node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeDeclarationStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeLiteral node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeMethodReference node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(TypeParameter node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(UnionType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(UsesDirective node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(VariableDeclarationExpression node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(VariableDeclarationStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(VariableDeclarationFragment node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(WhileStatement node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(WildcardType node) {
                return super.visit(node);
            }

            @Override
            public boolean visit(YieldStatement node) {
                return super.visit(node);
            }
        });

        System.out.println("hello");

        ImportRewrite rewrite = ImportRewrite.create(cu, false);

    }
}
