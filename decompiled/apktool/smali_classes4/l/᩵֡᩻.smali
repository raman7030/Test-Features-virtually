.class public final Ll/᩵֡᩻;
.super Ljava/lang/Object;
.source "7A0X"


# static fields
.field public static final ֫:Ll/ܺۢ᩻;


# direct methods
.method public static constructor <clinit>()V
    .locals 4

    .line 13
    new-instance v0, Ll/ܺۢ᩻;

    const-string v1, "_smb._tcp.local."

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "smb"

    const/16 v3, 0x1bd

    invoke-direct {v0, v2, v3, v1}, Ll/ܺۢ᩻;-><init>(Ljava/lang/String;I[Ljava/lang/String;)V

    sput-object v0, Ll/᩵֡᩻;->֫:Ll/ܺۢ᩻;

    return-void
.end method

.method public static ֫(Ll/ۗܺ᩷;Ll/ܿ֡᩻;)V
    .locals 2

    .line 23
    new-instance v0, Ll/᩶ᩴᩳ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ll/ۘ֡᩻;

    invoke-direct {v1, p1}, Ll/ۘ֡᩻;-><init>(Ll/ܿ֡᩻;)V

    sget-object p1, Ll/᩵֡᩻;->֫:Ll/ܺۢ᩻;

    invoke-static {p0, p1, v0, v1}, Ll/֡ۢ᩻;->֫(Ll/ۗܺ᩷;Ll/ܺۢ᩻;Ll/ۡۢ᩻;Ll/۬ۤ;)V

    return-void
.end method
