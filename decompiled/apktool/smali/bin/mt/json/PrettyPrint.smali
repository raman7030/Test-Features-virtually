.class public Lbin/mt/json/PrettyPrint;
.super Lbin/mt/json/WriterConfig;
.source "PrettyPrint.java"


# instance fields
.field public final indentChars:[C


# direct methods
.method public constructor <init>([C)V
    .locals 0

    .line 40
    invoke-direct {p0}, Lbin/mt/json/WriterConfig;-><init>()V

    .line 41
    iput-object p1, p0, Lbin/mt/json/PrettyPrint;->indentChars:[C

    return-void
.end method

.method public static indentWithSpaces(I)Lbin/mt/json/PrettyPrint;
    .locals 1

    if-ltz p0, :cond_0

    .line 63
    new-array p0, p0, [C

    const/16 v0, 0x20

    .line 64
    invoke-static {p0, v0}, Ljava/util/Arrays;->fill([CC)V

    .line 65
    new-instance v0, Lbin/mt/json/PrettyPrint;

    invoke-direct {v0, p0}, Lbin/mt/json/PrettyPrint;-><init>([C)V

    return-object v0

    .line 61
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "number is negative"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static indentWithTabs()Lbin/mt/json/PrettyPrint;
    .locals 4

    .line 74
    new-instance v0, Lbin/mt/json/PrettyPrint;

    const/4 v1, 0x1

    new-array v1, v1, [C

    const/16 v2, 0x9

    const/4 v3, 0x0

    aput-char v2, v1, v3

    invoke-direct {v0, v1}, Lbin/mt/json/PrettyPrint;-><init>([C)V

    return-object v0
.end method

.method public static singleLine()Lbin/mt/json/PrettyPrint;
    .locals 2

    .line 50
    new-instance v0, Lbin/mt/json/PrettyPrint;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbin/mt/json/PrettyPrint;-><init>([C)V

    return-object v0
.end method


# virtual methods
.method public createWriter(Ljava/io/Writer;)Ll/֫᩻ܳ;
    .locals 3

    .line 79
    new-instance v0, Ll/ܽ᩻ܳ;

    iget-object v1, p0, Lbin/mt/json/PrettyPrint;->indentChars:[C

    const/4 v2, 0x0

    invoke-direct {v0, p1, v1, v2}, Ll/ܽ᩻ܳ;-><init>(Ljava/io/Writer;[CLl/ۧ᩻ܳ;)V

    return-object v0
.end method
