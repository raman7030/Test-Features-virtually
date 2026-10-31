.class public final Ll/ۤ֡֫;
.super Ljava/lang/Object;
.source "68KX"

# interfaces
.implements Ll/۫֡֫;


# static fields
.field public static final ܽ:Ljava/lang/String;

.field public static final ᩳ:Ljava/lang/String;


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 48
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0x24

    .line 3741
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    .line 48
    sput-object v0, Ll/ۤ֡֫;->ᩳ:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3741
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    .line 49
    sput-object v0, Ll/ۤ֡֫;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, Ll/ۤ֡֫;->ۧ:Ljava/lang/String;

    .line 53
    iput p2, p0, Ll/ۤ֡֫;->֫:I

    return-void
.end method

.method public static ֫(Landroid/os/Bundle;)Ll/ۤ֡֫;
    .locals 3

    .line 64
    new-instance v0, Ll/ۤ֡֫;

    sget-object v1, Ll/ۤ֡֫;->ᩳ:Ljava/lang/String;

    .line 65
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 155
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    sget-object v2, Ll/ۤ֡֫;->ܽ:Ljava/lang/String;

    .line 66
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v0, v1, p0}, Ll/ۤ֡֫;-><init>(Ljava/lang/String;I)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 3

    .line 57
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 58
    sget-object v1, Ll/ۤ֡֫;->ᩳ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۤ֡֫;->ۧ:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 59
    sget-object v1, Ll/ۤ֡֫;->ܽ:Ljava/lang/String;

    iget v2, p0, Ll/ۤ֡֫;->֫:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method
