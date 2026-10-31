.class public final Ll/᩻ۨ֡;
.super Ll/ۖ۟֡;
.source "36B9"


# instance fields
.field public final synthetic ۙ:I

.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/᩷ۨ֡;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/᩷ۨ֡;III)V
    .locals 0

    .line 409
    iput-object p1, p0, Ll/᩻ۨ֡;->᩸:Ll/᩷ۨ֡;

    iput p2, p0, Ll/᩻ۨ֡;->ۙ:I

    iput p3, p0, Ll/᩻ۨ֡;->᩹:I

    iput p4, p0, Ll/᩻ۨ֡;->᩶:I

    .line 43
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    return-void
.end method


# virtual methods
.method public final size()I
    .locals 1

    .line 420
    iget v0, p0, Ll/᩻ۨ֡;->᩶:I

    return v0
.end method

.method public final ֫(I)Ljava/lang/Object;
    .locals 3

    .line 413
    new-instance v0, Ll/ܺۨ֡;

    iget-object v1, p0, Ll/᩻ۨ֡;->᩸:Ll/᩷ۨ֡;

    iget-object v1, v1, Ll/᩷ۨ֡;->ۧ:Ll/۬ۛ֡;

    mul-int/lit8 p1, p1, 0x8

    iget v2, p0, Ll/᩻ۨ֡;->ۙ:I

    add-int/2addr p1, v2

    iget v2, p0, Ll/᩻ۨ֡;->᩹:I

    invoke-direct {v0, v1, p1, v2}, Ll/ܺۨ֡;-><init>(Ll/۬ۛ֡;II)V

    return-object v0
.end method
