.class public final Ll/ۛ֡֫;
.super Ljava/lang/Object;
.source "M8N6"

# interfaces
.implements Ll/۫֡֫;


# static fields
.field public static final ܳ:Ljava/lang/String;

.field public static final ܿ:Ljava/lang/String;

.field public static final ᩳ:Ljava/lang/String;


# instance fields
.field public ֫:I

.field public ۧ:I

.field public final ܽ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 96
    sget-object v0, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const/4 v0, 0x0

    const/16 v1, 0x24

    .line 3741
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    .line 96
    sput-object v0, Ll/ۛ֡֫;->ܿ:Ljava/lang/String;

    const/4 v0, 0x1

    .line 3741
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    .line 97
    sput-object v0, Ll/ۛ֡֫;->ᩳ:Ljava/lang/String;

    const/4 v0, 0x2

    .line 3741
    invoke-static {v0, v1}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v0

    .line 98
    sput-object v0, Ll/ۛ֡֫;->ܳ:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(III)V
    .locals 0

    .line 101
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 102
    iput p1, p0, Ll/ۛ֡֫;->ۧ:I

    .line 103
    iput p2, p0, Ll/ۛ֡֫;->֫:I

    .line 104
    iput p3, p0, Ll/ۛ֡֫;->ܽ:I

    return-void
.end method

.method public static ֫(Landroid/os/Bundle;)Ll/ۛ֡֫;
    .locals 4

    .line 116
    new-instance v0, Ll/ۛ֡֫;

    sget-object v1, Ll/ۛ֡֫;->ܿ:Ljava/lang/String;

    .line 117
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v1

    sget-object v2, Ll/ۛ֡֫;->ᩳ:Ljava/lang/String;

    .line 118
    invoke-virtual {p0, v2}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result v2

    sget-object v3, Ll/ۛ֡֫;->ܳ:Ljava/lang/String;

    .line 119
    invoke-virtual {p0, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;)I

    move-result p0

    invoke-direct {v0, v1, v2, p0}, Ll/ۛ֡֫;-><init>(III)V

    return-object v0
.end method


# virtual methods
.method public final ֫()Landroid/os/Bundle;
    .locals 3

    .line 108
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 109
    sget-object v1, Ll/ۛ֡֫;->ܿ:Ljava/lang/String;

    iget v2, p0, Ll/ۛ֡֫;->ۧ:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 110
    sget-object v1, Ll/ۛ֡֫;->ᩳ:Ljava/lang/String;

    iget v2, p0, Ll/ۛ֡֫;->֫:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 111
    sget-object v1, Ll/ۛ֡֫;->ܳ:Ljava/lang/String;

    iget v2, p0, Ll/ۛ֡֫;->ܽ:I

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    return-object v0
.end method
