.class public final Ll/ᩳ᩵֡;
.super Ljava/lang/Object;
.source "O6MN"

# interfaces
.implements Ll/ۧ֨֡;


# static fields
.field public static final ֫:Ljava/util/regex/Pattern;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const-string v0, "^\\[([xX\\s])]\\s+(.*)"

    .line 12
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Ll/ᩳ᩵֡;->֫:Ljava/util/regex/Pattern;

    return-void
.end method

.method public static bridge synthetic ֫()Ljava/util/regex/Pattern;
    .locals 1

    .line 0
    sget-object v0, Ll/ᩳ᩵֡;->֫:Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public final ֫(Ll/֡ۚ֡;)Ll/֡ۚ֡;
    .locals 1

    .line 16
    new-instance v0, Ll/ܽ᩵֡;

    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 17
    invoke-virtual {p1, v0}, Ll/֡ۚ֡;->֫(Ll/ۤۚ֡;)V

    return-object p1
.end method
