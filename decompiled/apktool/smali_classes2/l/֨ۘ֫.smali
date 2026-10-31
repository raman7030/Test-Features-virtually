.class public final Ll/֨ۘ֫;
.super Ljava/lang/Object;
.source "X6AW"

# interfaces
.implements Ll/ۚۘ֫;


# instance fields
.field public final ֫:Landroid/os/Messenger;


# direct methods
.method public constructor <init>(Landroid/os/Messenger;)V
    .locals 0

    .line 1146
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1147
    iput-object p1, p0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    return-void
.end method

.method private ֫(ILandroid/os/Bundle;)V
    .locals 1

    .line 1190
    invoke-static {}, Landroid/os/Message;->obtain()Landroid/os/Message;

    move-result-object v0

    .line 1191
    iput p1, v0, Landroid/os/Message;->what:I

    const/4 p1, 0x2

    .line 1192
    iput p1, v0, Landroid/os/Message;->arg1:I

    .line 1193
    invoke-virtual {v0, p2}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V

    .line 1194
    iget-object p1, p0, Ll/֨ۘ֫;->֫:Landroid/os/Messenger;

    invoke-virtual {p1, v0}, Landroid/os/Messenger;->send(Landroid/os/Message;)V

    return-void
.end method


# virtual methods
.method public final ֫()V
    .locals 2

    const/4 v0, 0x2

    const/4 v1, 0x0

    .line 1171
    invoke-direct {p0, v0, v1}, Ll/֨ۘ֫;->֫(ILandroid/os/Bundle;)V

    return-void
.end method

.method public final ֫(Ljava/lang/String;Ljava/util/List;Landroid/os/Bundle;)V
    .locals 2

    .line 1178
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "data_media_item_id"

    .line 1179
    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "data_options"

    .line 1180
    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    const-string p1, "data_notify_children_changed_options"

    const/4 p3, 0x0

    .line 1181
    invoke-virtual {v0, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    if-eqz p2, :cond_1

    .line 1184
    instance-of p1, p2, Ljava/util/ArrayList;

    if-eqz p1, :cond_0

    check-cast p2, Ljava/util/ArrayList;

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    move-object p2, p1

    :goto_0
    const-string p1, "data_media_item_list"

    .line 1183
    invoke-virtual {v0, p1, p2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    :cond_1
    const/4 p1, 0x3

    .line 1186
    invoke-direct {p0, p1, v0}, Ll/֨ۘ֫;->֫(ILandroid/os/Bundle;)V

    return-void
.end method
