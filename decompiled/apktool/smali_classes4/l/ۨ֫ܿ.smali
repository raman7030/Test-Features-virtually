.class public final synthetic Ll/ۨ֫ܿ;
.super Ljava/lang/Object;
.source "N4RP"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput v0, p0, Ll/ۨ֫ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ll/᩺֫ܿ;)V
    .locals 0

    const/4 p1, 0x0

    .line 0
    iput p1, p0, Ll/ۨ֫ܿ;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Ll/ۨ֫ܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    return-object v0

    .line 607
    :pswitch_0
    invoke-static {}, Ll/᩹֡᩷;->ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const v0, -0x6f3f3f40

    goto :goto_0

    :cond_0
    const/high16 v0, -0x76000000

    .line 0
    :goto_0
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
