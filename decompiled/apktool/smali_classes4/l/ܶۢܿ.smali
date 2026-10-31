.class public final Ll/ܶۢܿ;
.super Ljava/lang/Object;
.source "V702"


# instance fields
.field public ֫:J

.field public ۧ:I

.field public ܽ:I

.field public ᩳ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(ILjava/lang/CharSequence;)V
    .locals 0

    .line 5354
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5355
    invoke-virtual {p0, p1, p2}, Ll/ܶۢܿ;->֫(ILjava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final ֫(ILjava/lang/CharSequence;)V
    .locals 2

    .line 5359
    iput-object p2, p0, Ll/ܶۢܿ;->ᩳ:Ljava/lang/CharSequence;

    .line 5360
    iput p1, p0, Ll/ܶۢܿ;->ܽ:I

    .line 5361
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Ll/ܶۢܿ;->ۧ:I

    .line 5362
    iget-wide p1, p0, Ll/ܶۢܿ;->֫:J

    const-wide/16 v0, 0x1

    add-long/2addr p1, v0

    iput-wide p1, p0, Ll/ܶۢܿ;->֫:J

    return-void
.end method
