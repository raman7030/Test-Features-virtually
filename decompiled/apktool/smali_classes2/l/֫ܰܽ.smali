.class public final Ll/֫ܰܽ;
.super Ll/۬ۗܿ;
.source "G16V"


# instance fields
.field public final synthetic ֫֫:Ljava/lang/String;

.field public final synthetic ۟:Ll/ܽܰܽ;


# direct methods
.method public constructor <init>(Ll/ܽܰܽ;Ll/ܽܰܽ;Ljava/lang/String;)V
    .locals 0

    .line 203
    iput-object p1, p0, Ll/֫ܰܽ;->۟:Ll/ܽܰܽ;

    iput-object p3, p0, Ll/֫ܰܽ;->֫֫:Ljava/lang/String;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 206
    iget-object v0, p0, Ll/֫ܰܽ;->۟:Ll/ܽܰܽ;

    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v1

    .line 207
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    if-nez v2, :cond_0

    .line 208
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :cond_0
    const-string v2, "/"

    .line 209
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_3

    const-string v2, "\\"

    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_1

    .line 211
    :cond_1
    invoke-static {v1}, Ll/ܺ᩺ܽ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const v0, 0x7f1203a1

    .line 212
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 215
    :cond_2
    :try_start_0
    iget-object v2, p0, Ll/֫ܰܽ;->֫֫:Ljava/lang/String;

    invoke-static {v2, v1}, Ll/ܺ᩺ܽ;->֫(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    const/4 v2, 0x0

    .line 546
    invoke-virtual {v0, v1, v2}, Ll/ۗܺ᩷;->֫(Ljava/lang/Throwable;Landroid/content/DialogInterface$OnDismissListener;)V

    .line 219
    :goto_0
    invoke-static {}, Ll/ܺ᩺ܽ;->ۧ()Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Ll/ܽܰܽ;->֫(Ll/ܽܰܽ;Ljava/util/ArrayList;)V

    .line 220
    invoke-static {v0}, Ll/ܽܰܽ;->֫(Ll/ܽܰܽ;)Ll/ۧܰܽ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 221
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :cond_3
    :goto_1
    const v0, 0x7f1203ae

    .line 210
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void
.end method
