.class public final synthetic Ll/ܽ۫ۜ;
.super Ljava/lang/Object;
.source "D8GL"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ܽ۫ۜ;->᩸:I

    iput-object p2, p0, Ll/ܽ۫ۜ;->᩹:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 5

    .line 2
    iget v0, p0, Ll/ܽ۫ۜ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ܽ۫ۜ;->᩹:Ljava/lang/Object;

    .line 9
    check-cast v0, [Landroid/widget/RadioButton;

    .line 210
    array-length v1, v0

    const/4 v2, 0x0

    goto :goto_0

    .line 0
    :pswitch_0
    iget-object p1, p0, Ll/ܽ۫ۜ;->᩹:Ljava/lang/Object;

    check-cast p1, Ll/ۤۤۜ;

    invoke-static {p1}, Ll/ۤۤۜ;->ᩴ(Ll/ۤۤۜ;)V

    return-void

    :goto_0
    if-ge v2, v1, :cond_1

    .line 210
    aget-object v3, v0, v2

    if-ne p1, v3, :cond_0

    const/4 v4, 0x1

    goto :goto_1

    :cond_0
    const/4 v4, 0x0

    .line 211
    :goto_1
    invoke-virtual {v3, v4}, Landroid/widget/CompoundButton;->setChecked(Z)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
