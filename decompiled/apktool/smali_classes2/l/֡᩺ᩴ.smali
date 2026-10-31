.class public final synthetic Ll/֡᩺ᩴ;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, Ll/֡᩺ᩴ;->a:I

    iput-object p2, p0, Ll/֡᩺ᩴ;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ll/֡᩺ᩴ;->a:I

    packed-switch v0, :pswitch_data_0

    .line 0
    iget-object v0, p0, Ll/֡᩺ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/ܶ۫ᩴ;

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ll/֡᩺ᩴ;->b:Ljava/lang/Object;

    check-cast v0, Ll/۫᩺ᩴ;

    const/4 v1, 0x0

    .line 367
    invoke-virtual {v0, v1}, Ll/۫᩺ᩴ;->r0(I)Ll/ܶ۫ᩴ;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
