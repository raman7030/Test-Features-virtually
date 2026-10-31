.class public final Ll/ܰ۟֡;
.super Ll/ۙ۬֡;
.source "P5B9"


# instance fields
.field public final ᩸:Ll/۬ۛ֡;

.field public final ᩹:I


# direct methods
.method public constructor <init>(Ll/۬ۛ֡;Ll/ᩴۨ֡;I)V
    .locals 0

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ܰ۟֡;->᩸:Ll/۬ۛ֡;

    add-int/lit8 p3, p3, 0x1

    .line 49
    invoke-virtual {p2, p3}, Ll/ᩴۨ֡;->᩻(I)I

    move-result p1

    iput p1, p0, Ll/ܰ۟֡;->᩹:I

    return-void
.end method


# virtual methods
.method public final getValue()Ll/᩵ܽۚ;
    .locals 3

    .line 55
    new-instance v0, Ll/᩸ܰ֡;

    iget-object v1, p0, Ll/ܰ۟֡;->᩸:Ll/۬ۛ֡;

    iget v2, p0, Ll/ܰ۟֡;->᩹:I

    invoke-direct {v0, v1, v2}, Ll/᩸ܰ֡;-><init>(Ll/۬ۛ֡;I)V

    return-object v0
.end method
