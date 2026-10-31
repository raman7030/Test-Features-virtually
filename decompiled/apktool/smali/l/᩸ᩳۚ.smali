.class public abstract Ll/᩸ᩳۚ;
.super Ljava/lang/Object;
.source "B5D2"

# interfaces
.implements Ll/᩺֫ۚ;


# instance fields
.field public final ᩸:Ll/֨ۗ֡;


# direct methods
.method public constructor <init>(Ll/֨ۗ֡;)V
    .locals 1

    .line 98
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 99
    invoke-virtual {p0}, Ll/᩸ᩳۚ;->۫()Ll/ۘۗ֡;

    move-result-object v0

    invoke-static {p1, v0}, Ll/ۧᩳܽ;->֫(Ll/֨ۗ֡;Ll/ۘۗ֡;)V

    .line 100
    iput-object p1, p0, Ll/᩸ᩳۚ;->᩸:Ll/֨ۗ֡;

    return-void
.end method


# virtual methods
.method public ۚ()I
    .locals 1

    .line 203
    invoke-virtual {p0}, Ll/᩸ᩳۚ;->۫()Ll/ۘۗ֡;

    move-result-object v0

    iget v0, v0, Ll/ۘۗ֡;->᩹:I

    div-int/lit8 v0, v0, 0x2

    return v0
.end method

.method public final ۢ()Ll/֨ۗ֡;
    .locals 1

    .line 197
    iget-object v0, p0, Ll/᩸ᩳۚ;->᩸:Ll/֨ۗ֡;

    return-object v0
.end method

.method public abstract ۫()Ll/ۘۗ֡;
.end method
