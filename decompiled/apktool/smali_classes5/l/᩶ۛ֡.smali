.class public final Ll/᩶ۛ֡;
.super Ll/ۖ۟֡;
.source "B5S9"


# instance fields
.field public final synthetic ᩸:Ll/۬ۛ֡;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;I)V
    .locals 0

    .line 741
    iput-object p1, p0, Ll/᩶ۛ֡;->᩸:Ll/۬ۛ֡;

    iput p2, p0, Ll/᩶ۛ֡;->᩹:I

    .line 43
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 750
    iget v0, p0, Ll/᩶ۛ֡;->᩹:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 2

    .line 744
    iget-object v0, p0, Ll/᩶ۛ֡;->᩸:Ll/۬ۛ֡;

    iget v1, v0, Ll/۬ۛ֡;->ܺ:I

    add-int/lit8 v1, v1, 0x4

    mul-int/lit8 p1, p1, 0xc

    add-int/2addr p1, v1

    .line 745
    new-instance v1, Ll/֨ܰ֡;

    invoke-direct {v1, v0, p1}, Ll/֨ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v1
.end method
