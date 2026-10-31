.class public final synthetic Ll/ᩴ᩵᩷;
.super Ljava/lang/Object;
.source "6AY4"

# interfaces
.implements Landroid/view/View$OnLayoutChangeListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ᩴ᩵᩷;->᩸:I

    iput-object p2, p0, Ll/ᩴ᩵᩷;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onLayoutChange(Landroid/view/View;IIIIIIII)V
    .locals 12

    move-object v0, p0

    .line 0
    iget v1, v0, Ll/ᩴ᩵᩷;->᩸:I

    packed-switch v1, :pswitch_data_0

    iget-object v1, v0, Ll/ᩴ᩵᩷;->᩹:Ljava/lang/Object;

    move-object v2, v1

    check-cast v2, Lcom/google/android/material/carousel/CarouselLayoutManager;

    move-object v3, p1

    move v4, p2

    move v5, p3

    move/from16 v6, p4

    move/from16 v7, p5

    move/from16 v8, p6

    move/from16 v9, p7

    move/from16 v10, p8

    move/from16 v11, p9

    invoke-static/range {v2 .. v11}, Lcom/google/android/material/carousel/CarouselLayoutManager;->$r8$lambda$l_qCTHOyjlXYirl7hEzmLbCJVAg(Lcom/google/android/material/carousel/CarouselLayoutManager;Landroid/view/View;IIIIIIII)V

    return-void

    :pswitch_0
    iget-object v1, v0, Ll/ᩴ᩵᩷;->᩹:Ljava/lang/Object;

    check-cast v1, Ll/᩵֡᩷;

    invoke-static {v1}, Ll/᩵֡᩷;->֫(Ll/᩵֡᩷;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
