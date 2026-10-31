.class public abstract Ll/ۤ᩺֫;
.super Ljava/lang/Object;
.source "P7MX"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Z

.field public final ܽ:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Z)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput-object p1, p0, Ll/ۤ᩺֫;->֫:Ljava/lang/String;

    .line 46
    invoke-static {p2}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Ll/ۤ᩺֫;->ܽ:Ljava/util/List;

    .line 47
    iput-boolean p3, p0, Ll/ۤ᩺֫;->ۧ:Z

    return-void
.end method


# virtual methods
.method public abstract ֫(Ljava/util/List;)Ljava/lang/Object;
.end method
