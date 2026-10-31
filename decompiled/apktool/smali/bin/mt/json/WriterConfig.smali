.class public abstract Lbin/mt/json/WriterConfig;
.super Ljava/lang/Object;
.source "WriterConfig.java"


# static fields
.field public static MINIMAL:Lbin/mt/json/WriterConfig;

.field public static PRETTY_PRINT:Lbin/mt/json/WriterConfig;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 35
    new-instance v0, Ll/ᩳ᩻ܳ;

    invoke-direct {v0}, Ll/ᩳ᩻ܳ;-><init>()V

    sput-object v0, Lbin/mt/json/WriterConfig;->MINIMAL:Lbin/mt/json/WriterConfig;

    const/4 v0, 0x2

    .line 45
    invoke-static {v0}, Lbin/mt/json/PrettyPrint;->indentWithSpaces(I)Lbin/mt/json/PrettyPrint;

    move-result-object v0

    sput-object v0, Lbin/mt/json/WriterConfig;->PRETTY_PRINT:Lbin/mt/json/WriterConfig;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract createWriter(Ljava/io/Writer;)Ll/֫᩻ܳ;
.end method
