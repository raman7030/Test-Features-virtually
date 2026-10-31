.class public interface abstract Ll/ۧ۟ܺ;
.super Ljava/lang/Object;
.source "E7PV"


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "/\\*\\s*(\\p{javaJavaIdentifierStart}\\p{javaJavaIdentifierPart}*(\\Q...\\E)?)\\s*=\\s*\\*/"

    .line 49
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ۧ۟ܺ;->֫:Ljava/util/regex/Pattern;

    return-void
.end method
