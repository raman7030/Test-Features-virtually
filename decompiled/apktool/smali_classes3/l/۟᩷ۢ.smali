.class public final Ll/۟᩷ۢ;
.super Ljava/lang/Object;
.source "U9SC"


# instance fields
.field public final ֫:Ljava/lang/CharSequence;

.field public final ۧ:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;II)V
    .locals 0

    .line 262
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 263
    invoke-static {p3, p1, p4}, Ll/֫ۢۢ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩷ۢ;->ۧ:Ljava/lang/CharSequence;

    .line 264
    invoke-static {p3, p2, p5}, Ll/֫ۢۢ;->֫(Ljava/lang/String;Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;

    move-result-object p1

    iput-object p1, p0, Ll/۟᩷ۢ;->֫:Ljava/lang/CharSequence;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 256
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 257
    iput-object p1, p0, Ll/۟᩷ۢ;->ۧ:Ljava/lang/CharSequence;

    .line 258
    iput-object p2, p0, Ll/۟᩷ۢ;->֫:Ljava/lang/CharSequence;

    return-void
.end method
