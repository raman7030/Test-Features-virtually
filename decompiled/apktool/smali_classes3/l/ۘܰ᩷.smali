.class public final Ll/ۘܰ᩷;
.super Ll/۬ۗܿ;
.source "I1KV"


# instance fields
.field public final synthetic ֫֫:Ljava/lang/String;

.field public final synthetic ۟:Ll/᩸ܰ᩷;


# direct methods
.method public constructor <init>(Ll/᩸ܰ᩷;Ll/ۗܺ᩷;Ljava/lang/String;)V
    .locals 0

    .line 663
    iput-object p1, p0, Ll/ۘܰ᩷;->۟:Ll/᩸ܰ᩷;

    iput-object p3, p0, Ll/ۘܰ᩷;->֫֫:Ljava/lang/String;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 9

    .line 667
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v0

    .line 668
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 669
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :cond_0
    const-string v1, "[a-z0-9^\\-]+"

    .line 672
    invoke-virtual {v0, v1}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    const v0, 0x7f1203ae

    .line 673
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 676
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ll/ۘܰ᩷;->֫֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "/"

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/type-info"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 677
    iget-object v1, p0, Ll/ۘܰ᩷;->۟:Ll/᩸ܰ᩷;

    invoke-static {v1}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v3

    invoke-virtual {v3, v0}, Ll/᩵ۨ᩷;->ۡ(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const v0, 0x7f1206b1

    .line 678
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 681
    :cond_2
    invoke-static {v1}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v3

    invoke-virtual {v3, v2}, Ll/᩵ۨ᩷;->ۧ(Ljava/lang/String;)Ll/ᩴۢᩴ;

    move-result-object v3

    .line 682
    invoke-virtual {v3}, Ll/ᩴۢᩴ;->size()I

    move-result v4

    const/4 v5, 0x1

    add-int/2addr v4, v5

    .line 683
    :goto_0
    invoke-virtual {v3, v4}, Ll/ᩴۢᩴ;->contains(I)Z

    move-result v6

    if-eqz v6, :cond_3

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 686
    :cond_3
    invoke-static {v1}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v3

    const/16 v6, 0x7f

    .line 1252
    invoke-virtual {v3, v6, v2}, Ll/᩵ۨ᩷;->֫(ILjava/lang/String;)I

    move-result v2

    .line 688
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "<?xml version=\'1.0\' encoding=\'utf-8\' ?>\n"

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 690
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    new-array v7, v5, [Ljava/lang/Object;

    const/4 v8, 0x0

    aput-object v6, v7, v8

    const-string v6, "<type id=\"0x%02x\">\n"

    invoke-static {v6, v7}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 691
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/4 v6, 0x2

    new-array v6, v6, [Ljava/lang/Object;

    aput-object v2, v6, v8

    aput-object v4, v6, v5

    const-string v2, "    <entry id=\"0x%02x%02x0000\" name=\"todo\" />\n"

    invoke-static {v2, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "</type>\n"

    .line 692
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 694
    :try_start_0
    invoke-static {v1}, Ll/᩸ܰ᩷;->ᩳ(Ll/᩸ܰ᩷;)Ll/᩵ۨ᩷;

    move-result-object v2

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v0, v3}, Ll/᩵ۨ᩷;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 699
    invoke-virtual {v1}, Ll/᩸ܰ᩷;->ۧ()V

    .line 700
    invoke-virtual {v1, v0}, Ll/᩸ܰ᩷;->ۧ(Ljava/lang/String;)V

    .line 701
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :catch_0
    move-exception v0

    .line 696
    invoke-static {v1}, Ll/᩸ܰ᩷;->ܳ(Ll/᩸ܰ᩷;)Ll/ۘۛ᩷;

    move-result-object v1

    invoke-virtual {v1, v0}, Ll/ۘۛ᩷;->֫(Ljava/lang/Throwable;)V

    return-void
.end method
