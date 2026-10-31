.class public final synthetic Ll/᩶ۜ᩻;
.super Ljava/lang/Object;
.source "B7T7"

# interfaces
.implements Ll/᩻ۜ᩻;


# instance fields
.field public final synthetic ֫:Ll/ۙۜ᩻;

.field public final synthetic ۧ:Ll/ۗۢ᩻;

.field public final synthetic ܳ:Ljava/lang/String;

.field public final synthetic ܽ:I

.field public final synthetic ܿ:Ljava/lang/String;

.field public final synthetic ᩳ:I


# direct methods
.method public synthetic constructor <init>(Ll/ۙۜ᩻;Ll/ۗۢ᩻;IILjava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩶ۜ᩻;->֫:Ll/ۙۜ᩻;

    iput-object p2, p0, Ll/᩶ۜ᩻;->ۧ:Ll/ۗۢ᩻;

    iput p3, p0, Ll/᩶ۜ᩻;->ܽ:I

    iput p4, p0, Ll/᩶ۜ᩻;->ᩳ:I

    iput-object p5, p0, Ll/᩶ۜ᩻;->ܿ:Ljava/lang/String;

    iput-object p6, p0, Ll/᩶ۜ᩻;->ܳ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜۜ᩻;II)V
    .locals 10

    .line 2
    iget-object v0, p0, Ll/᩶ۜ᩻;->ۧ:Ll/ۗۢ᩻;

    .line 4
    iget v1, p0, Ll/᩶ۜ᩻;->ܽ:I

    .line 6
    iget v2, p0, Ll/᩶ۜ᩻;->ᩳ:I

    .line 8
    iget-object v3, p0, Ll/᩶ۜ᩻;->ܿ:Ljava/lang/String;

    .line 10
    iget-object v4, p0, Ll/᩶ۜ᩻;->ܳ:Ljava/lang/String;

    .line 79
    iget-object v5, p0, Ll/᩶ۜ᩻;->֫:Ll/ۙۜ᩻;

    iget-object v6, v5, Ll/ۙۜ᩻;->ۜ:Ll/᩺ۤܿ;

    iget-object v7, p1, Ll/ۜۜ᩻;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۜۜ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v6, v7}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    .line 80
    iget-object v6, v5, Ll/ۙۜ᩻;->ۜ:Ll/᩺ۤܿ;

    int-to-long v8, p2

    int-to-long p2, p3

    invoke-virtual {v6, v8, v9, p2, p3}, Ll/᩺ۤܿ;->֫(JJ)V

    .line 82
    :try_start_0
    invoke-virtual {v0, v1, v2, p1}, Ll/ۗۢ᩻;->֫(IILjava/lang/String;)V

    const/4 p2, 0x1

    .line 83
    iput-boolean p2, v5, Ll/ۙۜ᩻;->ܳ:Z

    const/16 p2, 0x2f

    .line 84
    invoke-virtual {v7, p2}, Ljava/lang/String;->indexOf(I)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    .line 85
    iget-object p2, v5, Ll/ۙۜ᩻;->᩷:Ll/ۗۜ᩻;

    invoke-static {p2}, Ll/ۗۜ᩻;->ۧ(Ll/ۗۜ᩻;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll/ᩳۜܳ;

    .line 86
    invoke-interface {p3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 87
    check-cast p3, Ll/ܿۜ᩻;

    .line 88
    invoke-virtual {p3}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 90
    invoke-virtual {p1, v3, v4}, Ll/ܽۜܳ;->֫(Ljava/lang/String;Ljava/lang/String;)Ll/ܽۜܳ;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ܿۜ᩻;->֫(Ll/ܽۜܳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 97
    iget-object p2, v5, Ll/ۙۜ᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p3, Ljava/lang/Exception;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p3, v0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_1
    const/4 p1, 0x0

    .line 0
    invoke-virtual {p2, p1, p3}, Ljava/util/concurrent/atomic/AtomicReference;->compareAndSet(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_1

    :cond_3
    :goto_0
    return-void
.end method
