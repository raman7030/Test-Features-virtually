.class public final synthetic Ll/ۛᩴܿ;
.super Ljava/lang/Object;
.source "898C"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic ᩸:I

.field public final synthetic ᩹:Ljava/io/Serializable;


# direct methods
.method public synthetic constructor <init>(ILjava/io/Serializable;)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۛᩴܿ;->᩸:I

    iput-object p2, p0, Ll/ۛᩴܿ;->᩹:Ljava/io/Serializable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$andThen(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 2
    iget v0, p0, Ll/ۛᩴܿ;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    iget-object v0, p0, Ll/ۛᩴܿ;->᩹:Ljava/io/Serializable;

    .line 9
    check-cast v0, Ljava/util/ArrayList;

    .line 11
    check-cast p1, Ll/ۤܳ۠;

    .line 1046
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    return-object p1

    .line 0
    :pswitch_0
    iget-object v0, p0, Ll/ۛᩴܿ;->᩹:Ljava/io/Serializable;

    check-cast v0, Ljava/lang/String;

    check-cast p1, Ljava/io/File;

    invoke-static {p1, v0}, Ll/ۨᩴܿ;->֫(Ljava/io/File;Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public synthetic compose(Ljava/util/function/Function;)Ljava/util/function/Function;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/᩷ۛᩴ;->$default$compose(Ljava/util/function/Function;Ljava/util/function/Function;)Ljava/util/function/Function;

    move-result-object p1

    return-object p1
.end method
