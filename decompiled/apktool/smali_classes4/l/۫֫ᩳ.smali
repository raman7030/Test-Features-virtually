.class public final Ll/۫֫ᩳ;
.super Ll/۬ۗܿ;
.source "L58U"


# instance fields
.field public final synthetic ۟:Ll/᩺֫ᩳ;


# direct methods
.method public constructor <init>(Ll/᩺֫ᩳ;Ll/ۗܺ᩷;)V
    .locals 0

    .line 129
    iput-object p1, p0, Ll/۫֫ᩳ;->۟:Ll/᩺֫ᩳ;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 4

    .line 132
    iget-object v0, p0, Ll/۫֫ᩳ;->۟:Ll/᩺֫ᩳ;

    const-string v1, "Can not create file: "

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v2

    .line 133
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_0

    .line 134
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 137
    :cond_0
    invoke-static {v2}, Ll/֫ۧᩳ;->֫(Ljava/lang/String;)Ll/ܶ᩵ܿ;

    move-result-object v2

    .line 138
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۤ()Z

    move-result v3

    if-eqz v3, :cond_1

    const v0, 0x7f1202a8

    .line 139
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 142
    :cond_1
    :try_start_0
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۨ()V

    .line 143
    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ۗ()Z

    move-result v3

    if-eqz v3, :cond_3

    .line 145
    invoke-static {}, Ll/֫ۧᩳ;->֫()Ljava/util/List;

    move-result-object v1

    invoke-static {v0, v1}, Ll/᩺֫ᩳ;->֫(Ll/᩺֫ᩳ;Ljava/util/List;)V

    .line 146
    invoke-static {v0}, Ll/᩺֫ᩳ;->ᩳ(Ll/᩺֫ᩳ;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    .line 147
    invoke-static {v0}, Ll/᩺֫ᩳ;->ۧ(Ll/᩺֫ᩳ;)Landroid/widget/BaseAdapter;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    goto :goto_0

    .line 149
    :cond_2
    invoke-static {v0}, Ll/᩺֫ᩳ;->ܽ(Ll/᩺֫ᩳ;)Ll/֡ۚۢ;

    move-result-object v0

    invoke-virtual {v0}, Ll/֡ۚۢ;->dismiss()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 154
    :goto_0
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    .line 144
    :cond_3
    :try_start_1
    new-instance v0, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2}, Ll/ܶ᩵ܿ;->ܺ֫()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    move-exception v0

    .line 151
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->֫(Ljava/lang/String;)V

    return-void
.end method
