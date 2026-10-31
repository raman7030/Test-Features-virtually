.class public final Ll/ۡ;
.super Landroid/os/Handler;
.source "95XT"


# instance fields
.field public final ֫:Ljava/lang/ref/WeakReference;

.field public ۧ:Ljava/lang/ref/WeakReference;


# direct methods
.method public constructor <init>(Ll/᩵;)V
    .locals 1

    .line 2123
    invoke-direct {p0}, Landroid/os/Handler;-><init>()V

    .line 2124
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۡ;->֫:Ljava/lang/ref/WeakReference;

    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    .line 2130
    iget-object v0, p0, Ll/ۡ;->ۧ:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_4

    .line 2131
    iget-object v0, p0, Ll/ۡ;->֫:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 2134
    :cond_0
    invoke-virtual {p1}, Landroid/os/Message;->getData()Landroid/os/Bundle;

    move-result-object v1

    .line 2135
    invoke-static {v1}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 2136
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll/֨;

    .line 2137
    iget-object v2, p0, Ll/ۡ;->ۧ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/os/Messenger;

    const/4 v3, 0x1

    .line 2139
    :try_start_0
    iget v4, p1, Landroid/os/Message;->what:I
    :try_end_0
    .catch Landroid/os/BadParcelableException; {:try_start_0 .. :try_end_0} :catch_0

    const-string v5, "data_media_item_id"

    if-eq v4, v3, :cond_3

    const/4 v6, 0x2

    if-eq v4, v6, :cond_2

    const/4 v6, 0x3

    if-eq v4, v6, :cond_1

    .line 2168
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    return-void

    :cond_1
    const-string v4, "data_options"

    .line 2153
    invoke-virtual {v1, v4}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v4

    .line 2154
    invoke-static {v4}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    const-string v6, "data_notify_children_changed_options"

    .line 2157
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v6

    .line 2158
    invoke-static {v6}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 2161
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "data_media_item_list"

    .line 2162
    invoke-virtual {v1, v6}, Landroid/os/Bundle;->getParcelableArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 2160
    invoke-interface {v0, v2, v5, v4}, Ll/֨;->֫(Landroid/os/Messenger;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void

    .line 2150
    :cond_2
    invoke-interface {v0}, Ll/֨;->֫()V

    return-void

    :cond_3
    const-string v2, "data_root_hints"

    .line 2141
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v2

    .line 2142
    invoke-static {v2}, Ll/᩻ۧ;->֫(Landroid/os/Bundle;)V

    .line 2145
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    const-string v2, "data_media_session_token"

    .line 2146
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object v1

    check-cast v1, Ll/ܳۧ;

    .line 2144
    invoke-interface {v0}, Ll/֨;->ۧ()V
    :try_end_1
    .catch Landroid/os/BadParcelableException; {:try_start_1 .. :try_end_1} :catch_0

    return-void

    .line 2176
    :catch_0
    iget p1, p1, Landroid/os/Message;->what:I

    if-ne p1, v3, :cond_4

    .line 2177
    invoke-interface {v0}, Ll/֨;->֫()V

    :cond_4
    :goto_0
    return-void
.end method

.method public final ֫(Landroid/os/Messenger;)V
    .locals 1

    .line 2183
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Ll/ۡ;->ۧ:Ljava/lang/ref/WeakReference;

    return-void
.end method
