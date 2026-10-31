.class public final Ll/ᩴܰ֫;
.super Ljava/lang/Object;
.source "08T5"


# instance fields
.field public final ֫:J

.field public ۧ:Landroid/graphics/Bitmap;

.field public final ܽ:I


# direct methods
.method public constructor <init>(IJ)V
    .locals 0

    .line 619
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 620
    iput p1, p0, Ll/ᩴܰ֫;->ܽ:I

    .line 621
    iput-wide p2, p0, Ll/ᩴܰ֫;->֫:J

    return-void
.end method


# virtual methods
.method public final ֫()J
    .locals 2

    .line 629
    iget-wide v0, p0, Ll/ᩴܰ֫;->֫:J

    return-wide v0
.end method

.method public final ֫(Landroid/graphics/Bitmap;)V
    .locals 0

    .line 637
    iput-object p1, p0, Ll/ᩴܰ֫;->ۧ:Landroid/graphics/Bitmap;

    return-void
.end method

.method public final ۧ()Landroid/graphics/Bitmap;
    .locals 1

    .line 633
    iget-object v0, p0, Ll/ᩴܰ֫;->ۧ:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method public final ܽ()I
    .locals 1

    .line 625
    iget v0, p0, Ll/ᩴܰ֫;->ܽ:I

    return v0
.end method

.method public final ᩳ()Z
    .locals 1

    .line 641
    iget-object v0, p0, Ll/ᩴܰ֫;->ۧ:Landroid/graphics/Bitmap;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
