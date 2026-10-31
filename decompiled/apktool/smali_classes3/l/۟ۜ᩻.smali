.class public final synthetic Ll/۟ۜ᩻;
.super Ljava/lang/Object;
.source "8AI4"

# interfaces
.implements Ll/᩻ۜ᩻;


# instance fields
.field public final synthetic ֫:Ll/֫᩷᩻;

.field public final synthetic ۧ:Ll/ۗۢ᩻;

.field public final synthetic ܽ:I


# direct methods
.method public synthetic constructor <init>(Ll/֫᩷᩻;Ll/ۗۢ᩻;I)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/۟ۜ᩻;->֫:Ll/֫᩷᩻;

    iput-object p2, p0, Ll/۟ۜ᩻;->ۧ:Ll/ۗۢ᩻;

    iput p3, p0, Ll/۟ۜ᩻;->ܽ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۜۜ᩻;II)V
    .locals 7

    .line 2
    iget-object v0, p0, Ll/۟ۜ᩻;->ۧ:Ll/ۗۢ᩻;

    .line 4
    iget v1, p0, Ll/۟ۜ᩻;->ܽ:I

    .line 76
    iget-object v2, p0, Ll/۟ۜ᩻;->֫:Ll/֫᩷᩻;

    iget-object v3, v2, Ll/֫᩷᩻;->ۜ:Ll/᩺ۤܿ;

    iget-object v4, p1, Ll/ۜۜ᩻;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/ۜۜ᩻;->ۧ:Ljava/lang/String;

    invoke-virtual {v3, v4}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    .line 77
    iget-object v3, v2, Ll/֫᩷᩻;->ۜ:Ll/᩺ۤܿ;

    int-to-long v5, p2

    int-to-long p2, p3

    invoke-virtual {v3, v5, v6, p2, p3}, Ll/᩺ۤܿ;->֫(JJ)V

    .line 79
    :try_start_0
    invoke-virtual {v0, v1, p1}, Ll/ۗۢ᩻;->ۧ(ILjava/lang/String;)V

    const/4 p2, 0x1

    .line 80
    iput-boolean p2, v2, Ll/֫᩷᩻;->ܳ:Z

    const/16 p2, 0x2f

    .line 81
    invoke-virtual {v4, p2}, Ljava/lang/String;->indexOf(I)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_3

    .line 82
    iget-object p2, v2, Ll/֫᩷᩻;->᩷:Ll/ۧ᩷᩻;

    invoke-static {p2}, Ll/ۧ᩷᩻;->ۧ(Ll/ۧ᩷᩻;)Ljava/util/List;

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

    .line 83
    invoke-interface {p3}, Ll/ᩳۜܳ;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 84
    check-cast p3, Ll/ܿۜ᩻;

    .line 85
    invoke-virtual {p3}, Ll/ܺۘܳ;->֨ۧ()Ll/ܽۜܳ;

    move-result-object p1

    if-eqz p1, :cond_3

    .line 87
    invoke-virtual {p1, v1}, Ll/ܽۜܳ;->֫(I)Ll/ܽۜܳ;

    move-result-object p1

    invoke-virtual {p3, p1}, Ll/ܿۜ᩻;->֫(Ll/ܽۜܳ;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    .line 94
    iget-object p2, v2, Ll/֫᩷᩻;->᩻:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance p3, Ljava/lang/Exception;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

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
