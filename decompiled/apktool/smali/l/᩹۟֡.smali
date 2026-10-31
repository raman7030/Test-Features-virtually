.class public abstract Ll/᩹۟֡;
.super Ll/֨᩶ܺ;
.source "O62Y"


# instance fields
.field public final ᩶:Ll/ᩴۨ֡;


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 0

    .line 49
    invoke-direct {p0}, Ll/֨᩶ܺ;-><init>()V

    .line 50
    invoke-virtual {p1}, Ll/۬ۛ֡;->ᩳ()Ll/ۘۨ֡;

    move-result-object p1

    invoke-virtual {p1, p2}, Ll/ۘۨ֡;->ܺ(I)Ll/ᩴۨ֡;

    move-result-object p1

    iput-object p1, p0, Ll/᩹۟֡;->᩶:Ll/ᩴۨ֡;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/Object;
    .locals 2

    .line 65
    iget-object v0, p0, Ll/᩹۟֡;->᩶:Ll/ᩴۨ֡;

    invoke-virtual {p0, v0}, Ll/᩹۟֡;->֫(Ll/ᩴۨ֡;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    invoke-virtual {v0}, Ll/ᩴۨ֡;->ۘ()V

    :cond_0
    return-object v1
.end method

.method public abstract ֫(Ll/ᩴۨ֡;)Ljava/lang/Object;
.end method
