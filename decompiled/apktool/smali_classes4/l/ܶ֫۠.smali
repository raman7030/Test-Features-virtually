.class public final synthetic Ll/ܶ֫۠;
.super Ljava/lang/Object;
.source "A451"

# interfaces
.implements Ljava/util/function/BiFunction;


# instance fields
.field public final synthetic ᩸:Ll/᩶֫۠;

.field public final synthetic ᩹:Ll/ۖܶ۠;


# direct methods
.method public synthetic constructor <init>(Ll/᩶֫۠;Ll/ۖܶ۠;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܶ֫۠;->᩸:Ll/᩶֫۠;

    iput-object p2, p0, Ll/ܶ֫۠;->᩹:Ll/ۖܶ۠;

    return-void
.end method


# virtual methods
.method public synthetic andThen(Ljava/util/function/Function;)Ljava/util/function/BiFunction;
    .locals 0

    .line 0
    invoke-static {p0, p1}, Ll/ܿۛᩴ;->$default$andThen(Ljava/util/function/BiFunction;Ljava/util/function/Function;)Ljava/util/function/BiFunction;

    move-result-object p1

    return-object p1
.end method

.method public final apply(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 2
    check-cast p1, Ll/֡֡֨;

    .line 4
    check-cast p2, Ll/ۤܶ۠;

    .line 6
    iget-object p2, p0, Ll/ܶ֫۠;->᩸:Ll/᩶֫۠;

    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2081
    iget-object v0, p0, Ll/ܶ֫۠;->᩹:Ll/ۖܶ۠;

    invoke-virtual {v0}, Ll/ۖܶ۠;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۤܶ۠;

    .line 2083
    :try_start_0
    iget-object v2, p2, Ll/᩶֫۠;->֫:Ll/᩹ܽ۠;

    iget-object v2, v2, Ll/᩹ܽ۠;->֨:Ll/᩶ۘ֨;

    invoke-virtual {v2, p1, v1}, Ll/᩶ۘ֨;->֫(Ll/֡֡֨;Ll/ۤܶ۠;)Ll/ܳ֡֨;

    move-result-object p1
    :try_end_0
    .catch Ll/᩷֡֨; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    nop

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_1
    return-object p1
.end method
