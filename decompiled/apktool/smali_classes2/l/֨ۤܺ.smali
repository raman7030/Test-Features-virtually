.class public final Ll/֨ۤܺ;
.super Ll/᩹ۤܺ;
.source "Y2OD"


# instance fields
.field public final synthetic ֫:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 0

    .line 280
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 155
    iput-object p1, p0, Ll/֨ۤܺ;->֫:Ljava/util/Comparator;

    return-void
.end method


# virtual methods
.method public final ۧ()Ljava/util/Map;
    .locals 2

    .line 158
    new-instance v0, Ljava/util/TreeMap;

    iget-object v1, p0, Ll/֨ۤܺ;->֫:Ljava/util/Comparator;

    invoke-direct {v0, v1}, Ljava/util/TreeMap;-><init>(Ljava/util/Comparator;)V

    return-object v0
.end method
