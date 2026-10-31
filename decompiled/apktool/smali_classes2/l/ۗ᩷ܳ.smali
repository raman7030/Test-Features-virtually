.class public final Ll/ۗ᩷ܳ;
.super Ljava/lang/Object;
.source "123V"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᩶:I

.field public final synthetic ᩸:Ll/ܽۢܳ;

.field public final synthetic ᩹:I


# direct methods
.method public constructor <init>(Ll/ܽۢܳ;II)V
    .locals 0

    .line 480
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۗ᩷ܳ;->᩸:Ll/ܽۢܳ;

    iput p2, p0, Ll/ۗ᩷ܳ;->᩶:I

    iput p3, p0, Ll/ۗ᩷ܳ;->᩹:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 483
    iget-object v0, p0, Ll/ۗ᩷ܳ;->᩸:Ll/ܽۢܳ;

    invoke-static {v0}, Ll/ܽۢܳ;->ܽ(Ll/ܽۢܳ;)Ljava/util/concurrent/atomic/AtomicInteger;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v1

    iget v2, p0, Ll/ۗ᩷ܳ;->᩶:I

    if-eq v2, v1, :cond_0

    return-void

    .line 486
    :cond_0
    invoke-virtual {v0}, Ll/ܽۢܳ;->ܰ()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 487
    invoke-static {p0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void

    .line 489
    :cond_1
    iget v3, p0, Ll/ۗ᩷ܳ;->᩹:I

    const-wide/16 v4, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-virtual/range {v0 .. v5}, Ll/ܽۢܳ;->onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V

    return-void
.end method
