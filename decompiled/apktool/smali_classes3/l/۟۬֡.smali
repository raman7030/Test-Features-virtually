.class public abstract Ll/۟۬֡;
.super Ljava/lang/Object;
.source "A67V"

# interfaces
.implements Ll/᩺֫ۚ;


# instance fields
.field public ᩸:Ll/ܺ۫֡;

.field public final ᩹:Ll/֨ۗ֡;


# direct methods
.method public constructor <init>(Ll/֨ۗ֡;)V
    .locals 1

    .line 49
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 50
    invoke-virtual {p0}, Ll/۟۬֡;->۫()Ll/ۘۗ֡;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۧᩳܽ;->֫(Ll/֨ۗ֡;Ll/ۘۗ֡;)V

    .line 51
    iput-object p1, p0, Ll/۟۬֡;->᩹:Ll/֨ۗ֡;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 1

    .line 77
    invoke-interface {p0}, Ll/᩺֫ۚ;->֨()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۚ()I
    .locals 1

    .line 62
    invoke-virtual {p0}, Ll/۟۬֡;->۫()Ll/ۘۗ֡;

    move-result-object v0

    iget v0, v0, Ll/ۘۗ֡;->᩹:I

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ۢ()Ll/֨ۗ֡;
    .locals 1

    .line 56
    iget-object v0, p0, Ll/۟۬֡;->᩹:Ll/֨ۗ֡;

    return-object v0
.end method

.method public final ۤ()Ll/ܺ۫֡;
    .locals 2

    .line 67
    iget-object v0, p0, Ll/۟۬֡;->᩸:Ll/ܺ۫֡;

    if-eqz v0, :cond_0

    return-object v0

    .line 68
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cannot get the location of an instruction that hasn\'t been added to a method."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public abstract ۫()Ll/ۘۗ֡;
.end method
