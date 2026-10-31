.class public final Ll/ܶܶ֡;
.super Ljava/lang/Object;
.source "95GH"


# instance fields
.field public final ֫:Ll/᩹ܶ֡;

.field public final ۧ:I

.field public final ܽ:I


# direct methods
.method public constructor <init>(Ll/᩹ܶ֡;II)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ܶܶ֡;->֫:Ll/᩹ܶ֡;

    .line 49
    iput p2, p0, Ll/ܶܶ֡;->ܽ:I

    .line 50
    iput p3, p0, Ll/ܶܶ֡;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۗ᩵ۚ;I)V
    .locals 2

    .line 92
    iget-object v0, p0, Ll/ܶܶ֡;->֫:Ll/᩹ܶ֡;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    iget v0, p0, Ll/ܶܶ֡;->ܽ:I

    iget v1, p0, Ll/ܶܶ֡;->ۧ:I

    sub-int/2addr v0, v1

    if-lt p2, v0, :cond_0

    const/16 v1, 0x70

    .line 94
    invoke-virtual {p1, v1}, Ll/ۗ᩵ۚ;->write(I)V

    sub-int/2addr p2, v0

    .line 95
    invoke-virtual {p1, p2}, Ll/ۗ᩵ۚ;->ۧ(I)V

    return-void

    :cond_0
    const/16 v0, 0x76

    .line 99
    invoke-virtual {p1, v0}, Ll/ۗ᩵ۚ;->write(I)V

    .line 100
    invoke-virtual {p1, p2}, Ll/ۗ᩵ۚ;->ۧ(I)V

    return-void
.end method
