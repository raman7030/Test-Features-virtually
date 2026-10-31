.class public final Ll/ۜܶۘ;
.super Ljava/lang/Object;
.source "51RR"


# static fields
.field public static ֫:Ljava/lang/String;

.field public static ۧ:Ljava/lang/String;

.field public static ܽ:Ljava/lang/String;

.field public static ᩳ:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    .line 528
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "tencent"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v1, Ljava/io/File;->separator:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, "mobileqq"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "opensdk"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    sput-object v0, Ll/ۜܶۘ;->֫:Ljava/lang/String;

    const-string v0, "key_restore_landscape"

    .line 533
    sput-object v0, Ll/ۜܶۘ;->ᩳ:Ljava/lang/String;

    const-string v0, "key_pass_report_via_param"

    .line 541
    sput-object v0, Ll/ۜܶۘ;->ۧ:Ljava/lang/String;

    const-string v0, "key_pass_report_via_timely"

    .line 542
    sput-object v0, Ll/ۜܶۘ;->ܽ:Ljava/lang/String;

    return-void
.end method
