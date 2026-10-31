.class public abstract Ll/ۙ۟֡;
.super Ljava/util/AbstractSet;
.source "E63W"


# instance fields
.field public final ᩶:I

.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;II)V
    .locals 0

    .line 48
    invoke-direct {p0}, Ljava/util/AbstractSet;-><init>()V

    .line 49
    iput-object p1, p0, Ll/ۙ۟֡;->᩸:Ll/۬ۛ֡;

    .line 50
    iput p2, p0, Ll/ۙ۟֡;->᩹:I

    .line 51
    iput p3, p0, Ll/ۙ۟֡;->᩶:I

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 4

    .line 59
    new-instance v0, Ll/᩶۟֡;

    iget v1, p0, Ll/ۙ۟֡;->᩹:I

    iget v2, p0, Ll/ۙ۟֡;->᩶:I

    iget-object v3, p0, Ll/ۙ۟֡;->᩸:Ll/۬ۛ֡;

    invoke-direct {v0, p0, v3, v1, v2}, Ll/᩶۟֡;-><init>(Ll/ۙ۟֡;Ll/۬ۛ֡;II)V

    return-object v0
.end method

.method public final size()I
    .locals 1

    .line 69
    iget v0, p0, Ll/ۙ۟֡;->᩶:I

    return v0
.end method

.method public abstract ֫(Ll/ᩴۨ֡;)Ll/ܽۛ֡;
.end method
