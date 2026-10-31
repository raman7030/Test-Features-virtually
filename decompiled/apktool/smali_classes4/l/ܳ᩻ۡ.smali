.class public final Ll/ܳ᩻ۡ;
.super Ll/۟ܶۡ;
.source "08W8"


# instance fields
.field public ۜ:Ljava/lang/String;

.field public final synthetic ܳ:Ll/ۗܺ᩷;

.field public final synthetic ᩻:I


# direct methods
.method public constructor <init>(Ll/ۗܺ᩷;I)V
    .locals 0

    .line 2
    iput-object p1, p0, Ll/ܳ᩻ۡ;->ܳ:Ll/ۗܺ᩷;

    .line 4
    iput p2, p0, Ll/ܳ᩻ۡ;->᩻:I

    .line 34
    invoke-direct {p0}, Ll/۟ܶۡ;-><init>()V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    .line 58
    iget-object v0, p0, Ll/ܳ᩻ۡ;->ۜ:Ljava/lang/String;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v1, "9000"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, "\u652f\u4ed8\u6210\u529f"

    .line 60
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 61
    sget-object v0, Ll/᩹ᩴۡ;->ܽ:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    return-void

    :sswitch_1
    const-string v1, "8000"

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :sswitch_2
    const-string v1, "6004"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "\u652f\u4ed8\u7ed3\u679c\u672a\u77e5"

    .line 65
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    .line 66
    sget-object v0, Ll/᩹ᩴۡ;->ܽ:Ljava/lang/Runnable;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    sget-object v0, Ll/۠۠᩵;->֫:Ll/۠۠᩵;

    :cond_1
    return-void

    :sswitch_3
    const-string v1, "6002"

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    const-string v0, "\u7f51\u7edc\u8fde\u63a5\u51fa\u9519"

    .line 72
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    :sswitch_4
    const-string v1, "6001"

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_0

    :cond_3
    const-string v0, "\u652f\u4ed8\u88ab\u53d6\u6d88"

    .line 71
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    :sswitch_5
    const-string v1, "5000"

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_4
    const-string v0, "\u91cd\u590d\u8bf7\u6c42"

    .line 70
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    :sswitch_6
    const-string v1, "4000"

    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    const-string v0, "\u652f\u4ed8\u5931\u8d25"

    .line 69
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    :cond_6
    :goto_0
    const-string v0, "\u672a\u77e5\u9519\u8bef"

    .line 73
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(Ljava/lang/CharSequence;)Ll/᩸ۚۢ;

    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x185d7c -> :sswitch_6
        0x18d1db -> :sswitch_5
        0x19463b -> :sswitch_4
        0x19463c -> :sswitch_3
        0x19463e -> :sswitch_2
        0x1a2ef8 -> :sswitch_1
        0x1aa357 -> :sswitch_0
    .end sparse-switch
.end method

.method public final ֫(Ljava/lang/Exception;)V
    .locals 2

    .line 78
    iget-object v0, p0, Ll/ܳ᩻ۡ;->ܳ:Ll/ۗܺ᩷;

    const/4 v1, 0x0

    .line 546
    invoke-virtual {v0, p1, v1}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    return-void
.end method

.method public final ۧ()V
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ܳ᩻ۡ;->ܳ:Ll/ۗܺ᩷;

    invoke-virtual {p0, v0}, Ll/۟ܶۡ;->֫(Ll/ۗܺ᩷;)V

    return-void
.end method

.method public final ܿ()V
    .locals 4

    .line 42
    sget-object v0, Ll/ۜ᩻ۡ;->֫:Ll/ۚۡ֫;

    iget v0, p0, Ll/ܳ᩻ۡ;->᩻:I

    const/4 v1, 0x0

    invoke-static {v0, v1}, Ll/ۜ᩻ۡ;->֫(II)[Ljava/lang/String;

    move-result-object v0

    .line 43
    new-instance v2, Ll/᩵ۢܳ;

    const/4 v3, 0x2

    invoke-direct {v2, v3, v0}, Ll/᩵ۢܳ;-><init>(ILjava/lang/Object;)V

    sput-object v2, Ll/᩹ᩴۡ;->ܽ:Ljava/lang/Runnable;

    .line 44
    new-instance v2, Lcom/alipay/sdk/app/PayTask;

    iget-object v3, p0, Ll/ܳ᩻ۡ;->ܳ:Ll/ۗܺ᩷;

    invoke-direct {v2, v3}, Lcom/alipay/sdk/app/PayTask;-><init>(Landroid/app/Activity;)V

    .line 45
    aget-object v0, v0, v1

    const/4 v1, 0x1

    invoke-virtual {v2, v0, v1}, Lcom/alipay/sdk/app/PayTask;->payV2(Ljava/lang/String;Z)Ljava/util/Map;

    move-result-object v0

    const-string v1, "resultStatus"

    .line 46
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p0, Ll/ܳ᩻ۡ;->ۜ:Ljava/lang/String;

    return-void
.end method

.method public final ᩳ()V
    .locals 0

    .line 82
    invoke-virtual {p0}, Ll/۟ܶۡ;->ܽ()V

    return-void
.end method
