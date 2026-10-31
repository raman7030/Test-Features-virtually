.class public final Ll/᩺۟֡;
.super Ll/᩶۬֡;
.source "O4L2"


# instance fields
.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V
    .locals 0

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 47
    iput-object p1, p0, Ll/᩺۟֡;->᩸:Ll/۬ۛ֡;

    add-int/lit8 p3, p3, 0x1

    .line 48
    invoke-virtual {p2, p3}, Ll/ᩴۨ֡;->᩻(I)I

    move-result p1

    iput p1, p0, Ll/᩺۟֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final getValue()Ll/ۚܽۚ;
    .locals 2

    .line 54
    iget-object v0, p0, Ll/᩺۟֡;->᩸:Ll/۬ۛ֡;

    iget v1, p0, Ll/᩺۟֡;->᩹:I

    invoke-virtual {v0, v1}, Ll/۬ۛ֡;->ܳ(I)Ll/ۗܰ֡;

    move-result-object v0

    return-object v0
.end method
