.class public final Ll/᩷ᩴ᩻;
.super Ljava/lang/Object;
.source "R80D"


# static fields
.field public static final ֫:Ll/ܺۢ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 14
    new-instance v0, Ll/ܺۢ᩻;

    const-string v1, "_ssh._tcp.local."

    const-string v2, "_sftp-ssh._tcp.local."

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "sftp"

    const/16 v3, 0x16

    invoke-direct {v0, v2, v3, v1}, Ll/ܺۢ᩻;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, Ll/᩷ᩴ᩻;->֫:Ll/ܺۢ᩻;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/۬ۤ;)V
    .locals 2

    .line 24
    new-instance v0, Ll/᩶۫᩷;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/᩻ᩴ᩻;

    invoke-direct {v1, p1}, Ll/᩻ᩴ᩻;-><init>(Ll/۬ۤ;)V

    sget-object p1, Ll/᩷ᩴ᩻;->֫:Ll/ܺۢ᩻;

    invoke-static {p0, p1, v0, v1}, Ll/֡ۢ᩻;->֫(Ll/ۗܺ᩷;Ll/ܺۢ᩻;Ll/ۡۢ᩻;Ll/۬ۤ;)V

    return-void
.end method
