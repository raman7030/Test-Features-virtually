.class public Ll/ۡᩳ;
.super Ljava/lang/Object;
.source "YB7L"

# interfaces
.implements Ll/ܿۡ֫;


# instance fields
.field public final synthetic ۙ:Ljava/lang/String;

.field public final synthetic ᩶:Ll/᩸ᩳ;

.field public final synthetic ᩸:Ll/᩵ᩳ;

.field public final synthetic ᩹:Ll/᩷ᩳ;


# direct methods
.method public constructor <init>(Ll/᩵ᩳ;Ljava/lang/String;Ll/᩷ᩳ;Ll/᩸ᩳ;)V
    .locals 0

    .line 130
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ۡᩳ;->᩸:Ll/᩵ᩳ;

    iput-object p2, p0, Ll/ۡᩳ;->ۙ:Ljava/lang/String;

    iput-object p3, p0, Ll/ۡᩳ;->᩹:Ll/᩷ᩳ;

    iput-object p4, p0, Ll/ۡᩳ;->᩶:Ll/᩸ᩳ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/᩻ۡ֫;Ll/᩺ۢ֫;)V
    .locals 5

    .line 136
    iget-object p1, p0, Ll/ۡᩳ;->᩸:Ll/᩵ᩳ;

    iget-object v0, p1, Ll/᩵ᩳ;->ܳ:Landroid/os/Bundle;

    iget-object v1, p1, Ll/᩵ᩳ;->֫:Ljava/util/HashMap;

    iget-object v2, p1, Ll/᩵ᩳ;->ܿ:Ljava/util/HashMap;

    sget-object v3, Ll/᩺ۢ֫;->ۤ:Ll/᩺ۢ֫;

    invoke-virtual {v3, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    iget-object v4, p0, Ll/ۡᩳ;->ۙ:Ljava/lang/String;

    if-eqz v3, :cond_1

    .line 137
    new-instance p1, Ll/ۘᩳ;

    iget-object p2, p0, Ll/ۡᩳ;->᩶:Ll/᩸ᩳ;

    iget-object v3, p0, Ll/ۡᩳ;->᩹:Ll/᩷ᩳ;

    invoke-direct {p1, p2, v3}, Ll/ۘᩳ;-><init>(Ll/᩸ᩳ;Ll/᩷ᩳ;)V

    invoke-virtual {v1, v4, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 138
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    .line 140
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    .line 141
    invoke-virtual {v2, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    invoke-interface {v3, p1}, Ll/᩷ᩳ;->֫(Ljava/lang/Object;)V

    .line 144
    :cond_0
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    check-cast p1, Ll/ۜᩳ;

    if-eqz p1, :cond_3

    .line 146
    invoke-virtual {v0, v4}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 148
    invoke-virtual {p1}, Ll/ۜᩳ;->ۧ()I

    move-result v0

    .line 149
    invoke-virtual {p1}, Ll/ۜᩳ;->֫()Landroid/content/Intent;

    move-result-object p1

    .line 147
    invoke-virtual {p2, p1, v0}, Ll/᩸ᩳ;->֫(Landroid/content/Intent;I)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {v3, p1}, Ll/᩷ᩳ;->֫(Ljava/lang/Object;)V

    return-void

    .line 151
    :cond_1
    sget-object v0, Ll/᩺ۢ֫;->ۛ:Ll/᩺ۢ֫;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 152
    invoke-virtual {v1, v4}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 153
    :cond_2
    sget-object v0, Ll/᩺ۢ֫;->ۗ:Ll/᩺ۢ֫;

    invoke-virtual {v0, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    .line 154
    invoke-virtual {p1, v4}, Ll/᩵ᩳ;->֫(Ljava/lang/String;)V

    :cond_3
    return-void
.end method
