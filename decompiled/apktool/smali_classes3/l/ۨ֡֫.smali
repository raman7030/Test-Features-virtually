.class public final Ll/ۨ֡֫;
.super Ljava/lang/Object;
.source "Q8R8"


# static fields
.field public static final ۧ:Ljava/lang/String;


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/16 v0, 0x24

    const/4 v1, 0x0

    .line 3741
    invoke-static {v1, v0}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    .line 37
    sput-object v0, Ll/ۨ֡֫;->ۧ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 39
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 40
    iput-object p1, p0, Ll/ۨ֡֫;->֫:Ljava/lang/String;

    return-void
.end method

.method public static ֫(Landroid/os/Bundle;)Ll/ۨ֡֫;
    .locals 2

    .line 50
    new-instance v0, Ll/ۨ֡֫;

    sget-object v1, Ll/ۨ֡֫;->ۧ:Ljava/lang/String;

    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    .line 155
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    invoke-direct {v0, p0}, Ll/ۨ֡֫;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 3

    .line 44
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 45
    sget-object v1, Ll/ۨ֡֫;->ۧ:Ljava/lang/String;

    iget-object v2, p0, Ll/ۨ֡֫;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
