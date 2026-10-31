.class public final Ll/ܺۡ֡;
.super Ll/ۡۡ֡;
.source "P7IE"

# interfaces
.implements Ljava/io/Serializable;


# static fields
.field public static final serialVersionUID:J = 0x1L


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 86
    new-instance v0, Ll/ܺۡ֡;

    .line 62
    sget-object v1, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    sget-object v2, Ll/ܽ۠ᩴ;->TERMINATE:Ll/ܽ۠ᩴ;

    invoke-direct {v0, v1, v2}, Ll/ۡۡ֡;-><init>(Ll/ܽ۠ᩴ;Ll/ܽ۠ᩴ;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 2
    sget-object p1, Ll/ܽ۠ᩴ;->TERMINATE:Ll/ܽ۠ᩴ;

    .line 4
    sget-object v0, Ll/ܽ۠ᩴ;->CONTINUE:Ll/ܽ۠ᩴ;

    .line 104
    invoke-direct {p0, p1, v0}, Ll/ۡۡ֡;-><init>(Ll/ܽ۠ᩴ;Ll/ܽ۠ᩴ;)V

    return-void
.end method


# virtual methods
.method public final accept(Ljava/io/File;)Z
    .locals 0

    .line 116
    invoke-static {p1}, Ll/۠֨ᩴ;->toPath(Ljava/io/File;)Ll/᩷۠ᩴ;

    move-result-object p1

    .line 143
    invoke-static {p1}, Ll/ܿ۠ᩴ;->isSymbolicLink(Ll/᩷۠ᩴ;)Z

    move-result p1

    return p1
.end method

.method public final ֫(Ll/᩷۠ᩴ;)Ll/ܽ۠ᩴ;
    .locals 0

    .line 143
    invoke-static {p1}, Ll/ܿ۠ᩴ;->isSymbolicLink(Ll/᩷۠ᩴ;)Z

    move-result p1

    .line 129
    invoke-virtual {p0, p1}, Ll/ۡۡ֡;->֫(Z)Ll/ܽ۠ᩴ;

    move-result-object p1

    return-object p1
.end method
