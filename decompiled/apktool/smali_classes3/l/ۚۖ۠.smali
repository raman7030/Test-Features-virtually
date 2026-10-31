.class public Ll/ۚۖ۠;
.super Ll/֨ۖ۠;
.source "S7QC"


# instance fields
.field public final ֫:Ll/᩹ܶ۠;


# direct methods
.method public constructor <init>(Ll/᩹ܶ۠;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 109
    iput-object p1, p0, Ll/ۚۖ۠;->֫:Ll/᩹ܶ۠;

    return-void
.end method


# virtual methods
.method public ֫(Ll/֡ۖ۠;)Ljava/lang/String;
    .locals 0

    .line 124
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public ֫()Ll/᩹ܶ۠;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/ۚۖ۠;->֫:Ll/᩹ܶ۠;

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 1

    .line 149
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ֫(Ll/᩷۠ᩴ;)V
    .locals 1

    .line 144
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-interface {p1}, Ll/᩷۠ᩴ;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ֫(Ll/֡ۖ۠;Ljava/lang/String;)Z
    .locals 0

    .line 139
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method public ۧ()Ljava/lang/String;
    .locals 1

    .line 119
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public ۧ(Ljava/lang/String;)V
    .locals 0

    .line 134
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method
