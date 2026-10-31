.class public final synthetic Ll/ۗۧ᩵;
.super Ljava/lang/Object;
.source "N673"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ll/᩶ᩳ᩵;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ll/᩶ᩳ᩵;Ljava/lang/Object;I)V
    .locals 0

    iput p3, p0, Ll/ۗۧ᩵;->a:I

    iput-object p1, p0, Ll/ۗۧ᩵;->b:Ll/᩶ᩳ᩵;

    iput-object p2, p0, Ll/ۗۧ᩵;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ll/ۗۧ᩵;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ll/ۗۧ᩵;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/Predicate;

    .line 97
    new-instance v1, Ll/ܽܽ᩵;

    iget-object v2, p0, Ll/ۗۧ᩵;->b:Ll/᩶ᩳ᩵;

    invoke-direct {v1, v2, v0}, Ll/ܽܽ᩵;-><init>(Ll/᩶ᩳ᩵;Ljava/util/function/Predicate;)V

    return-object v1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۗۧ᩵;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/DoublePredicate;

    .line 186
    new-instance v1, Ll/ۧᩳ᩵;

    iget-object v2, p0, Ll/ۗۧ᩵;->b:Ll/᩶ᩳ᩵;

    invoke-direct {v1, v2, v0}, Ll/ۧᩳ᩵;-><init>(Ll/᩶ᩳ᩵;Ljava/util/function/DoublePredicate;)V

    return-object v1

    .line 0
    :pswitch_1
    iget-object v0, p0, Ll/ۗۧ᩵;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/IntPredicate;

    .line 126
    new-instance v1, Ll/ۘܽ᩵;

    iget-object v2, p0, Ll/ۗۧ᩵;->b:Ll/᩶ᩳ᩵;

    invoke-direct {v1, v2, v0}, Ll/ۘܽ᩵;-><init>(Ll/᩶ᩳ᩵;Ljava/util/function/IntPredicate;)V

    return-object v1

    .line 0
    :pswitch_2
    iget-object v0, p0, Ll/ۗۧ᩵;->c:Ljava/lang/Object;

    check-cast v0, Ljava/util/function/LongPredicate;

    .line 156
    new-instance v1, Ll/ۙܽ᩵;

    iget-object v2, p0, Ll/ۗۧ᩵;->b:Ll/᩶ᩳ᩵;

    invoke-direct {v1, v2, v0}, Ll/ۙܽ᩵;-><init>(Ll/᩶ᩳ᩵;Ljava/util/function/LongPredicate;)V

    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
