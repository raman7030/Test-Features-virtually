.class public Lcom/amazonaws/util/TimingInfoFullSupport;
.super Lcom/amazonaws/util/TimingInfo;
.source "TimingInfoFullSupport.java"


# instance fields
.field public final ܽ:Ljava/util/HashMap;

.field public final ᩳ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(J)V
    .locals 1

    const/4 v0, 0x0

    .line 50
    invoke-direct {p0, p1, p2, v0}, Lcom/amazonaws/util/TimingInfo;-><init>(JLjava/lang/Long;)V

    .line 34
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/util/TimingInfoFullSupport;->ᩳ:Ljava/util/HashMap;

    .line 35
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Lcom/amazonaws/util/TimingInfoFullSupport;->ܽ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(JLjava/lang/String;)V
    .locals 1

    .line 123
    iget-object v0, p0, Lcom/amazonaws/util/TimingInfoFullSupport;->ܽ:Ljava/util/HashMap;

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-virtual {v0, p3, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final ֫(Ljava/lang/String;)V
    .locals 2

    .line 113
    iget-object v0, p0, Lcom/amazonaws/util/TimingInfoFullSupport;->ܽ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    if-eqz v0, :cond_0

    .line 133
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    add-int/lit8 v0, v0, 0x1

    int-to-long v0, v0

    .line 136
    invoke-virtual {p0, v0, v1, p1}, Lcom/amazonaws/util/TimingInfoFullSupport;->֫(JLjava/lang/String;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Lcom/amazonaws/util/TimingInfo;)V
    .locals 2

    .line 55
    iget-object v0, p0, Lcom/amazonaws/util/TimingInfoFullSupport;->ᩳ:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    if-nez v1, :cond_0

    .line 57
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    invoke-virtual {v0, p1, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    :cond_0
    invoke-virtual {p2}, Lcom/amazonaws/util/TimingInfo;->ᩳ()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 61
    invoke-interface {v1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void

    .line 63
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    invoke-static {p2}, Lcom/amazonaws/logging/LogFactory;->֫(Ljava/lang/Class;)Lcom/amazonaws/logging/Log;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Skip submeasurement timing info with no end time for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1}, Lcom/amazonaws/logging/Log;->ۧ(Ljava/lang/String;)V

    return-void
.end method
