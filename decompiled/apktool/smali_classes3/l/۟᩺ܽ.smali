.class public final Ll/۟᩺ܽ;
.super Ll/۬ۗܿ;
.source "G16V"


# instance fields
.field public final synthetic ֫֫:Ljava/lang/String;

.field public final synthetic ۟:Ll/ܽܰܽ;


# direct methods
.method public constructor <init>(Ll/ܽܰܽ;Ll/ܽܰܽ;Ljava/lang/String;)V
    .locals 0

    .line 162
    iput-object p1, p0, Ll/۟᩺ܽ;->۟:Ll/ܽܰܽ;

    iput-object p3, p0, Ll/۟᩺ܽ;->֫֫:Ljava/lang/String;

    const/4 p1, -0x1

    .line 40
    invoke-direct {p0, p2, p1}, Ll/۬ۗܿ;-><init>(Ll/ۗܺ᩷;I)V

    return-void
.end method


# virtual methods
.method public final ᩴ()V
    .locals 3

    .line 165
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۢ()Ljava/lang/String;

    move-result-object v0

    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-eqz v1, :cond_5

    iget-object v1, p0, Ll/۟᩺ܽ;->֫֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_1

    :cond_0
    const-string v2, "/"

    .line 168
    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_4

    const-string v2, "\\"

    invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_1

    goto :goto_0

    .line 170
    :cond_1
    invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {v0}, Ll/ܺ᩺ܽ;->ۧ(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    const v0, 0x7f1203a1

    .line 171
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 173
    :cond_2
    invoke-static {v1, v0}, Ll/ܺ᩺ܽ;->ۧ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_3

    const v0, 0x7f120881

    .line 174
    invoke-static {v0}, Ll/᩸ۚۢ;->֫(I)Ll/᩸ۚۢ;

    .line 176
    :cond_3
    invoke-static {}, Ll/ܺ᩺ܽ;->ۧ()Ljava/util/ArrayList;

    move-result-object v0

    iget-object v1, p0, Ll/۟᩺ܽ;->۟:Ll/ܽܰܽ;

    invoke-static {v1, v0}, Ll/ܽܰܽ;->֫(Ll/ܽܰܽ;Ljava/util/ArrayList;)V

    .line 177
    invoke-static {v1}, Ll/ܽܰܽ;->֫(Ll/ܽܰܽ;)Ll/ۧܰܽ;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/BaseAdapter;->notifyDataSetChanged()V

    .line 178
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void

    :cond_4
    :goto_0
    const v0, 0x7f1203ae

    .line 169
    invoke-virtual {p0, v0}, Ll/۬ۗܿ;->ۧ(I)V

    return-void

    .line 167
    :cond_5
    :goto_1
    invoke-virtual {p0}, Ll/۬ۗܿ;->ۧ()V

    return-void
.end method
