.class public final Ll/ۤ۟ܺ;
.super Ljava/lang/Object;
.source "I7PF"

# interfaces
.implements Ll/۫۟ܺ;


# instance fields
.field public final ᩸:Ll/۠۟ܺ;


# direct methods
.method public constructor <init>(Ll/۠۟ܺ;)V
    .locals 0

    .line 28
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 29
    iput-object p1, p0, Ll/ۤ۟ܺ;->᩸:Ll/۠۟ܺ;

    return-void
.end method

.method public static ֫(Ll/۠۟ܺ;)Ll/ۤ۟ܺ;
    .locals 1

    .line 39
    new-instance v0, Ll/ۤ۟ܺ;

    invoke-direct {v0, p0}, Ll/ۤ۟ܺ;-><init>(Ll/۠۟ܺ;)V

    return-object v0
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 3

    .line 49
    invoke-static {p0}, Ll/ܺܶܺ;->֫(Ljava/lang/Object;)Ll/ۡܶܺ;

    move-result-object v0

    const-string v1, "plusIndent"

    iget-object v2, p0, Ll/ۤ۟ܺ;->᩸:Ll/۠۟ܺ;

    invoke-virtual {v0, v2, v1}, Ll/ۡܶܺ;->֫(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ll/ۡܶܺ;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/ᩴ۟ܺ;)V
    .locals 1

    .line 44
    iget-object v0, p0, Ll/ۤ۟ܺ;->᩸:Ll/۠۟ܺ;

    invoke-virtual {p1, v0}, Ll/ᩴ۟ܺ;->֫(Ll/۠۟ܺ;)V

    return-void
.end method
